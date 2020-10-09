public class YouTubeVideoIDExtractor {

    public static void main(String[] args) {

        System.out.println(youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg"));
        System.out.println(youtubeId("https://youtu.be/BCDEDi5gDPo"));
        System.out.println(youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4"));
        System.out.println(youtubeId("www.youtube.com/watch?list=PL3QZUm48uWnsdFakp3A2fI-NzmfH1jyQe&v=yv56ncTdTmU&index=8"));

    }

    public static String youtubeId(String link) {
        String[] lingSplit = link.split("/");
        String str = "";

        String[] idSplit =  lingSplit[lingSplit.length - 1].split("=|&");

        for(int i = 0; i <idSplit.length; i++) {

            if(idSplit[i].length() == 11) {
                str = idSplit[i];
                break;
            }
        }

        return str;

    }
}
