package by.svirski.lesson10.bean;

import java.util.List;

public class ParagraphItem extends TextItem {

	private List<SentenceItem> paragraph;
	
	public ParagraphItem() {
		// TODO Auto-generated constructor stub
	}

	public ParagraphItem(List<SentenceItem> paragraph) {
		super();
		this.paragraph = paragraph;
	}

	public List<SentenceItem> getParagraph() {
		return paragraph;
	}

	public void setParagraph(List<SentenceItem> paragraph) {
		this.paragraph = paragraph;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((paragraph == null) ? 0 : paragraph.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ParagraphItem other = (ParagraphItem) obj;
		if (paragraph == null) {
			if (other.paragraph != null) {
				return false;
			}
		} else if (!paragraph.equals(other.paragraph)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ParagraphItem [paragraph=");
		builder.append(paragraph);
		builder.append("]");
		return builder.toString();
	}
	
	

}
