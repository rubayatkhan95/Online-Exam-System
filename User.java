public class User{
		private String Name;
		private String password;
		private String email;
		private String contactNo;
		
	//	private String sit;
	//	private String cost;
		
		public User(){
			
		}
		
		//set()
		public void setName(String name){
			this.Name=name;
		}
		public void setPassword(String pas){
			this.password=pas;
		}
		public void setEmail(String mail){
			this.email=mail;
		}
		public void setContactNo(String contact){
			this.contactNo=contact;
		}
		
		
		//get()
		public String getNmae(){
			return this.Name;
		}
		public String getPassword(){
			return this.password;
		}
		
		public String getEmail(){
			return this.email;
		}
		public String getContactNo(){
			return this.contactNo;
		}
		
		
		
		
	}