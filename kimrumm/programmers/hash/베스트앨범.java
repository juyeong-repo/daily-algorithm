import java.util.*;
import java.util.Collections;

/**
 * [level 3] 베스트앨범 - 42579
 * 메모리: 77.5 MB, 시간: 1.07 ms
 * 코딩테스트 연습 > 해시
 */
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        ArrayList<Integer> bestMusic = new ArrayList<Integer>();
        Map<String, Integer> genresCnt = new HashMap<String, Integer>();
        Map<String, ArrayList> genresMusicList = new HashMap<String, ArrayList>();
        for(int i = 0; i < genres.length; i++){
            //장르별 재생횟수
            genresCnt.put(genres[i], genresCnt.getOrDefault(genres[i], 0) + plays[i]);
            
            //장르별 음악목록(횟수, 고유번호)
            ArrayList<Music> musicList = genresMusicList.get(genres[i]);
            if(musicList == null){
                musicList = new ArrayList<Music>();
            }
            musicList.add(new Music(plays[i], i));
            genresMusicList.put(genres[i], musicList);
        }
        
        //장르별 재생횟수 정렬
        List<Map.Entry<String, Integer>> genresSort = new LinkedList<>(genresCnt.entrySet());
        
        Collections.sort(genresSort, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        
        //장르별 베스트음악 추출
        for(Map.Entry<String, Integer> entry : genresSort) {
            ArrayList<Music> musicList = genresMusicList.get(entry.getKey());
            
            Collections.sort(musicList);
            bestMusic.add(musicList.get(0).playNo);
            if(musicList.size() > 1){
               bestMusic.add(musicList.get(1).playNo);
            }
        }
        
        answer = new int[bestMusic.size()];
        for(int i=0; i<bestMusic.size(); i++) {
            answer[i] = bestMusic.get(i);
        }    

        return answer;

    }
}
//Comparable 인터페이스를 구현하고 compareTo 메소드를 override하면 sort할 수 있다.
class Music implements Comparable<Music> {
    Integer playCnt;
    Integer playNo;

    public Music(int playCnt, int playNo) {
        this.playCnt = playCnt;
        this.playNo = playNo;
    }
    
    @Override
    public int compareTo(Music music) {
        return music.playCnt.compareTo(this.playCnt);
    }

}