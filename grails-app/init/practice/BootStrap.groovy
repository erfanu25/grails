package practice

class BootStrap {

    def init = { servletContext ->
       new List(name: "Erfan", email: "mderfan2@gmail.com", age:"21", phone:"01521438868").save()
        new List(name: "Karim", email: "karim@gmail.com", age:"23", phone:"01781438868").save()
        new Member(name: "Erfan", email:"erfan@bitmascot.com", password: "1234").save()
    }
    def destroy = {
    }
}
