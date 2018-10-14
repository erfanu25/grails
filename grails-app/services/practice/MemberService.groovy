package practice

import grails.transaction.Transactional

@Transactional
class MemberService {

    def doLogin(String email,String password) {
        password = password.encodeAsMD5()
        Member member = Member.findByEmailAndPassword(email, password)
        if(member)
        {
            return true
        }

    }
}
