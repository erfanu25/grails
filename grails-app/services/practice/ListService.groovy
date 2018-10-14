package practice

import grails.transaction.Transactional
import grails.web.servlet.mvc.GrailsParameterMap

@Transactional
class ListService {

    def list(){

       def contact = List.getAll()

        return [list: contact, count: List.count() ]
    }

    def createMember(GrailsParameterMap params){
        List list = new List(params)
        if(list.validate()) {
           list.save()
        }


    }

    def get(Serializable id){
        return List.get(id)
    }

    def update(List list, GrailsParameterMap params) {
        list.properties = params
        if(list.validate())
        {
            list.save()
        }
    }

    def delete(List list){
        try{
           list.delete()
        } catch (Exception e){
            println(e.getMessage())
        }
    }



}
