class ValidaEmail{
	isValidEmail(email){
		const emailRegex = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
		return emailRegex.test(String (email).toLowerCase());	
	}
}
module.exports= new ValidaEmail();

