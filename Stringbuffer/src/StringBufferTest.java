public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        /* sb.append("HI Hello"); */
        /* sb.append("jump to JAVA"); */
        /* sb.insert(0, "안녕"); 특정 위치에 원하는 문자열 삽입*/
        sb.append("Hello jump to java");
        /* System.out.println(sb.toString()); */
        System.out.println(sb.substring(0, 4));//0과 4는 시작과 끝 위치, 시작과 끝 자리의 문자를 제거하는 substring//
    }
}
