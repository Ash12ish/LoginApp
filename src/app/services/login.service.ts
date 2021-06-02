import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  url="http://localhost:9595"//base url
  constructor(private http:HttpClient) { }
//calling server for generating token 
generateToken(credentials:any)
{
  //token generate 

  return this.http.post(`${this.url}/token`,credentials)


}
  //for login user 
  loginUser(token)
  {
    localStorage.setItem("token",token)
    return true;
  }
  //if user is logged in 
  isLoggedIn()
  {

    let token= localStorage.getItem("token")
    if(token==undefined || token==''||token==null)
    {
      return false;
    }
    else
    {
      return true;
    }
  }
//for log out the user 
  logOut()
  {
    localStorage.removeItem('token')
    return true;
  }
  //for getting the token

  getToken()
  {

    return localStorage.getItem("token")
  }
}
