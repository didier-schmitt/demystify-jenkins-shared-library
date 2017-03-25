package org.example.ci

class Map2Props {

    def static convert(def map) {
        String conversion = ''

        map.each {key, value -> conversion = conversion + "${key}=${value}\n".toString()}
        return conversion
    }
}