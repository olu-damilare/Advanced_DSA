package webCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {

    private Queue<String> queue;
    private List<String> discoverWebSites;

    public WebCrawler() {
        this.queue = new LinkedList<>();
        this.discoverWebSites = new ArrayList<>();
    }

    public void discoveredWeb(String rootURL){
        this.queue.add(rootURL);
        discoverWebSites.add(rootURL);

        while(!queue.isEmpty()){
            String v = queue.remove();
            String rawHTML = readURL(v);

            String urlPattern = "";
            Pattern pattern = Pattern.compile(urlPattern);
            Matcher matcher = pattern.matcher(rawHTML);

            while(matcher.find()){
                String actualURL = matcher.group();

                if(!discoverWebSites.contains(actualURL)){
                    discoverWebSites.add(actualURL);
                    System.out.println("Website found with URL " + actualURL);
                    queue.add(actualURL);
                }
            }
        }
    }

    public String readURL(String v){
        String rawHTML = "";

        try{
            URL url = new URL(v);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine = in.readLine();

            while(inputLine  != null){
                rawHTML += inputLine;

                inputLine = in.readLine();
            }
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return rawHTML;
    }
}
