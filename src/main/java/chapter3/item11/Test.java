package chapter3.item11;

import java.util.LinkedList;

class HashTable{
    class Node{
        String key;
        String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    LinkedList<Node>[] data;
    HashTable(int size){
        this.data = new LinkedList[size];
    }

    int getHashCode(String key){
        int hashcode = 0;
        for(char c : key.toCharArray()){ //각 문자의 아스키코드 값을 가져옴
            hashcode += c;
        }
        return hashcode;
    }

    int convertToIndex(int hashcode){
        return hashcode % data.length; //해시코드 % 배열의 사이즈
    }

    Node searchKey(LinkedList<Node> list, String key){
        if (list == null) return null;
        for(Node node : list){ //배열 방에 있는 링크드 리스트를 돈다.
            if(node.key.equals(key)){ //노드의 키가 검색하는 키와 같은지를 확인
                return node;
            }
        }
        return null;
    }

    void put(String key, String value){
        int hashcode = getHashCode(key);//key를 통해 해쉬코드를 받아온다.
        int index = convertToIndex(hashcode);

        System.out.println(key + ", hashcode("+hashcode+"), index(" + index+ ")");

        LinkedList<Node> list = data[index]; // 배열방에 있는 번호를 이용하여 기존 배열방에 있던 데이터를 가져옴
        if(list == null){//배열방이 null이면
            list = new LinkedList<Node>(); //Linked List를 생성한다.
            data[index] = list; //그리고 생성한 list를 배열방에 넣어준다.
        }

        Node node = searchKey(list, key);//그리고 배열방에 혹시 기존에 해당키로 데이터를 가지고 있는지 노드를 받아온다.
        if(node == null){
            list.addLast(new Node(key, value));
        }else{
            //동일한 데이터가 있는 경우 데이터를 대치해줌으로써 중복키 처리
            node.setValue(value);
        }
    }

    String get(String key){
        int hashcode = getHashCode(key);//키로 해쉬코드를 구함
        int index = convertToIndex(hashcode);//해쉬코드로 인덱스를 구함
        LinkedList<Node> list = data[index];//인덱스에서 Linked List를 가져온다.
        Node node = searchKey(list, key);// 링크드 리스트 안에 해당 키를 가지는 노드를 검색한다.
        return node == null ? "Not found" : node.getValue();
    }
}

public class Test {
    public static void main(String[] args) {
//        HashTable h = new HashTable(3);//고정된 배열방 생성
//        h.put("sung", "She is pretty");
//        h.put("jin", "She is a model");
//        h.put("hee", "She is an angel");
//        h.put("min", "She is cute");
//        h.put("sung", "She is beautiful");//엎어치기
//
//        System.out.println(h.get("sung"));
//        System.out.println(h.get("jin"));
//        System.out.println(h.get("hee"));
//        System.out.println(h.get("min"));
//        System.out.println(h.get("jae"));

        System.out.println(31*2);
        System.out.println((2<<5)-2);
    }
}
