package burp.CustomIssues;
import burp.IHttpRequestResponse;
import burp.IHttpService;
import burp.IScanIssue;
import java.net.URL;

class CustomScanIssue implements IScanIssue
{
    private IHttpService httpService;
    private URL url;
    private IHttpRequestResponse[] httpMessages;
    private String issueName;
    private String issueDetail;
    private String issueBackground;
    private String remediationDetail;
    private String remediationBackground;
    private String severity;
    private String confidence;
    private int issueType;

    public CustomScanIssue(URL url, IHttpRequestResponse httpRequestResponse)
    {
        this.url = url;
        this.httpService = httpRequestResponse.getHttpService();
        this.httpMessages = new IHttpRequestResponse[] { httpRequestResponse };
    }
    
    public void setName(String name)
    {
        if (! name.isEmpty())
            issueName = name;
    }
    
    public void setDetail(String detail)
    {
        if (! detail.isEmpty())
            issueDetail = detail;
    }
    
    public void setBackground(String background)
    {
        if (! background.isEmpty())
            issueBackground = background;
    }
    
    public void setRemediationDetail(String remediationDetail)
    {
        if (! remediationDetail.isEmpty())
            this.remediationDetail = remediationDetail;
    }
    
    public void setRemediationBackground(String remediationBackground)
    {
        if (! remediationBackground.isEmpty())
            this.remediationBackground = remediationBackground;
    }
    
    public void setSeverity(String severity)
    {
        this.severity = severity;
    }
    
    public void setConfidence(String confidence)
    {
        this.confidence = confidence;
    }
    
    public void setType(int type)
    {
        this.issueType = type;
    }
    
    @Override
    public URL getUrl()
    {
        return url;
    }

    @Override
    public String getIssueName()
    {
        return issueName;
    }

    @Override
    public int getIssueType()
    {
        return issueType;
    }

    @Override
    public String getSeverity()
    {
        return severity;
    }

    @Override
    public String getConfidence()
    {
        return confidence;
    }

    @Override
    public String getIssueBackground()
    {
        return issueBackground;
    }

    @Override
    public String getRemediationBackground()
    {
        return remediationBackground;
    }

    @Override
    public String getIssueDetail()
    {
        return issueDetail;
    }

    @Override
    public String getRemediationDetail()
    {
        return remediationDetail;
    }

    @Override
    public IHttpRequestResponse[] getHttpMessages()
    {
        return httpMessages;
    }

    @Override
    public IHttpService getHttpService()
    {
        return httpService;
    }   
}