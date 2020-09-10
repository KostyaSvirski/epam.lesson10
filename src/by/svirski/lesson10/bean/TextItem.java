package by.svirski.lesson10.bean;

import java.util.List;

public class TextItem {
	
	protected static final String DELIMETER_WORDS = " ";	
	
	private List<? extends TextItem> text;

	public TextItem(List<? extends TextItem> text) {
		super();
		this.text = text;
	}

	public TextItem() {
		super();
	}

	public List<? extends TextItem> getText() {
		return text;
	}

	public void setText(List<? extends TextItem> text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TextItem other = (TextItem) obj;
		if (text == null) {
			if (other.text != null) {
				return false;
			}
		} else if (!text.equals(other.text)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TextItem [text=");
		builder.append(text);
		builder.append("]");
		return builder.toString();
	}
	
		
}
