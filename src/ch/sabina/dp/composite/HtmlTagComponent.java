package ch.sabina.dp.composite;

import java.util.List;

public abstract class HtmlTagComponent {
	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract void setEndTag(String tag);
	
	public void setTagBody(String tagBody){
		throw new UnsupportedOperationException("Current operation is not supported for this object");
	}
	public void addChildTag(HtmlTagComponent htmlTag){
		throw new UnsupportedOperationException("Current operation is not supported for this object");
	}
	public void removeChildTag(HtmlTagComponent htmlTag){
		throw new UnsupportedOperationException("Current operation is not supported for this object");
		}
	public List<HtmlTagComponent>getChildren(){
		throw new UnsupportedOperationException("Current operation is not supported for this object");
	}
	public abstract void generateHtml();
}
