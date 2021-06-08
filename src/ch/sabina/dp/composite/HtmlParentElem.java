package ch.sabina.dp.composite;

import java.util.List;

public class HtmlParentElem extends HtmlTagComponent {
	private String tagName;
	private String startTag;
	private String endTag;
	private List<HtmlTagComponent> childrenTags;

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
	public void generateHtml() {
		for(HtmlTagComponent each: childrenTags) {
			each.generateHtml();
		}
		
	}
	@Override
    public void addChildTag(HtmlTagComponent htmlTag){
        childrenTags.add(htmlTag);
    }
    @Override
    public void removeChildTag(HtmlTagComponent htmlTag){
        childrenTags.remove(htmlTag);
    }

    @Override
    public List<HtmlTagComponent> getChildren(){
        return childrenTags;
    }

}
