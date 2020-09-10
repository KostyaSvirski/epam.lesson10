package by.svirski.lesson10.bean;

public final class PunctItem extends SentenceItem{
	
	private String punct;
	
	public PunctItem() {
	}

	public PunctItem(String punct) {
		super();
		this.punct = punct;
	}

	public String getPunctList() {
		return punct;
	}

	public void setPunctList(String punctList) {
		this.punct = punctList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((punct == null) ? 0 : punct.hashCode());
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
		PunctItem other = (PunctItem) obj;
		if (punct == null) {
			if (other.punct != null) {
				return false;
			}
		} else if (!punct.equals(other.punct)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(punct);
		builder.append(" ");
		return builder.toString();
	}

	
		
}
