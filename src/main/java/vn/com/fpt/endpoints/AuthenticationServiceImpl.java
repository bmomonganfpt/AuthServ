package vn.com.fpt.endpoints;

import javax.jws.WebMethod;
import javax.jws.WebService;

import vn.com.fpt.interfaces.AuthenticationService;

@WebService(endpointInterface = "vn.com.fpt.interfaces.AuthenticationService")
public class AuthenticationServiceImpl implements AuthenticationService {

	@WebMethod
	public String getAuthentication() {
		return "Authenticated";
	}

}
