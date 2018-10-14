package practice

class List {

    String name
    String email
    String age
    String phone

    static constraints = {
        name(nullable: false, minSize: 4,blank: false)
        email(nullable: false,blank: false)
        age(nullable: false,blank: false)
        phone(nullable: false, blank:false)
    }
}
