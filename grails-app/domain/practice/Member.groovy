package practice

class Member {

    String name
    String email
    String password

    static constraints = {
        name(blank: false)
        email(blank: false)
        password(blank: false)
    }
   def beforeInsert = {
        this.password = this.password.encodeAsMD5()
    }

    def beforeUpdate = {
        this.password = this.password.encodeAsMD5()
    }

    static mapping = {
        version(false)
    }
}
