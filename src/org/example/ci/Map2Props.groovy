package org.example.ci

class Map2Props {

    def static convert(def list) {
        String conversion = ''

        for (int i =0; i < list.size(); i++) {
            conversion = conversion + "${list[i].key}=${list[i].value}\n".toString()
        }
        return conversion
    }
}