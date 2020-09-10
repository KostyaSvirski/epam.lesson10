package by.svirski.lesson10.bean;

import java.util.List;

public class CodeBlockItem extends TextItem{

	private List<String> codeBlock;
	
	public CodeBlockItem() {
		
	}

	public CodeBlockItem(List<String> codeBlock) {
		this.codeBlock = codeBlock;
	}

	public List<String> getCodeBlock() {
		return codeBlock;
	}

	public void setCodeBlock(List<String> codeBlock) {
		this.codeBlock = codeBlock;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((codeBlock == null) ? 0 : codeBlock.hashCode());
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
		CodeBlockItem other = (CodeBlockItem) obj;
		if (codeBlock == null) {
			if (other.codeBlock != null) {
				return false;
			}
		} else if (!codeBlock.equals(other.codeBlock)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for(String line : codeBlock) {
			builder.append(line + "\n");
		}
		return builder.toString();
	}
	
}
