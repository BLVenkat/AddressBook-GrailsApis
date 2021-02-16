class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
			"/address/getall"(controller: "addressBook", action: "index", method:"GET")
			"/address/get/$id"(controller: "addressBook", action: "show", method:"GET")
	
			"/address/create"(controller: "addressBook", action: "save", method:"POST")
			"/address/update/$id"(controller: "addressBook", action: "update", method:"PUT")
	
			"/address/delete/$id"(controller: "addressBook", action: "delete", method:"DELETE")
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
