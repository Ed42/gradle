extra["arctic"] = true
tasks.getByName("hello") {
    doLast {
        println("- The weight of my species in summer is twice as heavy as all human beings.")
    }
}

task("distanceToIceberg") {
    doLast {
        println("5 nautical miles")
    }
}
