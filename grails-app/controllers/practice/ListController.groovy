package practice

class ListController {

    static infoMessage(String message, boolean status = true) {
        return [info: message, success: status]
    }

    ListService listService
    def index() {

        def response = listService.list()
        [list: response.list, total:response.count]
    }

    def create() {

    }

    def doCreate(){
        def member = listService.createMember(params)
        if(member)
        {
            redirect(controller: "List", action:"index")
        }
        else
        {
            redirect(controller: "List", action:"create")
        }

    }

    def edit(Integer id){

        def response = listService.get(id)
        if(response)
        {
            [list:response]
        }

    }

    def delete(Integer id){
        def response = listService.get(id)
        if(response)
        {
            response = listService.delete(response)
            if(!response)
            {
                redirect(controller: "list", action: "index")
            }

        }
    }

    def update() {
        def response = listService.get(params.id)

        if(response)
        {
           response = listService.update(response,params)
            if(response) {
                redirect(controller: "list", action: "index")
            }
        }
    }
}
