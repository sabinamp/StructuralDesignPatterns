package ch.sabina.dp.composite;

public class LeafHtmlTag extends HtmlTagComponent{
	 private String tagName;
	 private String startTag;
	 private String endTag;
	 private String tagBody;
	   
	@Override
	public String getTagName() {
		
		return this.tagName;
	}

	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;
		
	}

	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;
		
	}
	
    @Override
    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

	@Override
	public void generateHtml() {
		System.out.println(startTag+""+tagBody+""+endTag);		
	}
	

}
