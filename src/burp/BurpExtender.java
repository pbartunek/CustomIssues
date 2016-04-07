package burp;

import burp.CustomIssues.IssueWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JMenuItem;

public class BurpExtender implements IBurpExtender, IContextMenuFactory
{
    private IBurpExtenderCallbacks callbacks;
    private IExtensionHelpers helpers;
    private IContextMenuInvocation invocation;

    private static final String EXTENSION_NAME = "Custom Issues";
    private static final String CONTEXT_MENU_ADD_ISSUE = "Add custom issue";
    private static final String CUSTOM_ISSUE_WINDOW_TITLE = "Add custom issue";

    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks)
    {
      this.callbacks = callbacks;
      this.helpers = callbacks.getHelpers();

      callbacks.setExtensionName(EXTENSION_NAME);
      callbacks.registerContextMenuFactory(this);
    }

    @Override
    public List<JMenuItem> createMenuItems(IContextMenuInvocation menuInvocation)
    {
        List<JMenuItem> menuItems = new ArrayList<>();
        invocation = menuInvocation;
        byte context = invocation.getInvocationContext();
        
        if (context == IContextMenuInvocation.CONTEXT_PROXY_HISTORY
            || context == IContextMenuInvocation.CONTEXT_MESSAGE_EDITOR_REQUEST)
        {
            JMenuItem item = new JMenuItem(CONTEXT_MENU_ADD_ISSUE);
            item.addActionListener((new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent arg0)
                    {
                        IssueWindow issueWindow = new IssueWindow(callbacks, helpers, invocation.getSelectedMessages());
                        issueWindow.setTitle(CUSTOM_ISSUE_WINDOW_TITLE);
                        issueWindow.setVisible(true);
                    }
                }));
            menuItems.add(item);
        }

        return menuItems;
    }
}
