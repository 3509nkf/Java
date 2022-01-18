package myProject;

public class JavaTest14 extends UserInfo{

	public static void main(String[] args) {
		@Override
		public int hashCode() {
			return HashCodeBuilder.reflectionHashCode(this);
		}
		
		@Override
		public boolean equals(Object obj) {
			return EqualsBuilder.reflectionEquals(this);
		}
	}

}
