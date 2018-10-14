package practice

class AuthenticationController {
    MemberService memberService

    def login()
    {

    }
    def doLogin()
    {
        if(memberService.doLogin(params.email,params.password)) {
            redirect(controller:"list", action:"index")
        }
        else
        {
            redirect(controller: "authentication", action: "login")
        }
    }
}
