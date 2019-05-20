package basics.implementiterable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Urllibrary implements Iterable<String>{

    private List<String> urls = new LinkedList<String>();

    private class urlIterator implements Iterator<String>{

        private int index = 0; // by default private int is not (0) but we mentioned as to clear.

        @Override
        public boolean hasNext(){
            return index < urls.size();
        }

        @Override
        public String next() {
            StringBuilder sb = new StringBuilder();

            try {
                URL url = new URL(urls.get(index));
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

                String line = null;

                while((line = br.readLine()) != null){
                    sb.append(line);
                    sb.append("\n");
                }
                br.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
            index++;
            return sb.toString();
        }

        @Override
        public void remove() {
            urls.remove(index);
        }

        @Override
        public void forEachRemaining(Consumer<? super String> action) {

        }
    }

    public Urllibrary() {
        urls.add("https://gaana.com");
        urls.add("https://www.caveofprogramming.com");
    }
    @Override
    public Iterator<String> iterator() {
        return new urlIterator();
    }

    /*@Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }*/
}