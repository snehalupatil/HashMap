import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedHashMapTest {

    @Test
    public void givenASentence_WhenWordAreAddedToList_shouldBeReturnParonoidFrequency(){
        String sentence = "Paranoids are not paranoid because they are paranoid but"+
                          "beecause they keep putting themselves deliberatly into"+
                          "paranoid avoided situations";
        MyLinkedHashMap<String,Integer> myLinkedHashMapHashMap =   new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words){
            Integer value = myLinkedHashMapHashMap.get(word);
            if(value == null) value = 1;
            else value = value + 1;
            myLinkedHashMapHashMap.add(word,value);
        }
        int frequency = myLinkedHashMapHashMap.get("paranoid");
        System.out.println(myLinkedHashMapHashMap);
        Assertions.assertEquals(3,frequency);
    }

    @Test
    public void givenASentence_WhenWordsAreAddedToList_ShouldBeRemoveWordFromList(){
        String sentence = "Paranoids are not paranoid because they are paranoid but because " +
                          "they keep putting themselves deliberately into paranoid avoidable situations";
        MyLinkedHashMap<String,Integer> myLinkedHashMap = new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words){
            Integer value = myLinkedHashMap.get(word);
            if(value == null) value=1;
            else value=value+1;
            myLinkedHashMap.add(word,value);
        }

        INode removedNode = myLinkedHashMap.remove("avoidable");
        System.out.println("Removed Key: " +removedNode.getKey());
        Assertions.assertEquals("Avoidable Key: ",removedNode.getKey());
    }

}
