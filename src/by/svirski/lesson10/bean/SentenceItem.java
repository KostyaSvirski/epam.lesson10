package by.svirski.lesson10.bean;

import java.util.List;

public class SentenceItem extends ParagraphItem implements Comparable<SentenceItem> {
	
	private List<? extends SentenceItem> sentence;

	public SentenceItem(List<WordItem> sentence) {
		super();
		this.sentence = sentence;
	}

	
	public SentenceItem() {
		super();
	}

	public List<? extends SentenceItem> getSentence() {
		return sentence;
	}

	public void setSentence(List<? extends SentenceItem> sentence) {
		this.sentence = sentence;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
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
		SentenceItem other = (SentenceItem) obj;
		if (sentence == null) {
			if (other.sentence != null) {
				return false;
			}
		} else if (!sentence.equals(other.sentence)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SentenceItem [sentence=");
		builder.append(sentence);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(SentenceItem o) {
		
		return 0;
	}
	

}
