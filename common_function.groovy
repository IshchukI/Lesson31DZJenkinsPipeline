def report(branch){
    description = "Report from Branch: ${branch}"
	println(description)
    if (params.url != "") {
        print("Run report generation for ${url}")
    }
}

def log_collection(){
    description = "Save logs for a test run. (${params.branch};${params.url}"
    if (params.save_logs == true) {
        print(description)
    }
}