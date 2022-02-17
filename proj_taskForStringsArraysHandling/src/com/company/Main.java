package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String fake_text = "lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut placerat pulvinar sagittis. Vivamus facilisis, nunc sed venenatis cursus, ante tortor accumsan enim, ac efficitur mauris eros et massa. Nulla vitae diam mattis, sollicitudin lacus id, viverra purus. Sed placerat erat sit amet magna ullamcorper auctor. Maecenas accumsan viverra accumsan. Morbi convallis arcu vel nisi rutrum, eu aliquam nisl mollis. Praesent non nulla mattis, suscipit ipsum eu, semper nunc. Maecenas lobortis diam nec ex consequat, et lacinia risus dignissim. Suspendisse sed laoreet nibh. Sed leo enim, commodo eget dapibus sed, ornare vitae augue. Aenean tempus felis ut efficitur aliquet. Donec sed";

        //1.1
//        String capitalized_first_letter = fake_text.substring(0, 1);
//        String capitalized_last_letter = fake_text.substring(fake_text.length() - 1);
//
//        var task1Result = capitalized_first_letter.toUpperCase() + fake_text.substring(1, fake_text.length() - 2) + capitalized_last_letter.toUpperCase();
//        System.out.println(task1Result);

        //1.2
        String new_str = " replaced ";
//        String word_to_replace = "amet";
//        System.out.println( fake_text.replace(word_to_replace, new_str));

        //1.3
        String getwords_pattern = "\\W?\\s"; //
        String[] words = fake_text.split(getwords_pattern);

        String modified_str_buff = new String(fake_text);

        for (var i :  words) {
            if (i.endsWith("is")) {
                modified_str_buff = modified_str_buff.replace(i, i + new_str);
            }
        }
        System.out.println(modified_str_buff);
        System.out.println(fake_text);

        // 1.4
//        int k = 10;
//        String getwords_pattern = "\\W?\\s"; //
//        String[] words = fake_text.split(getwords_pattern);
//
//        String modified_str_buff = new String(fake_text);
//        for (var i :  words) {
//            if (i.length() > k) {
//                String edited_str = i.substring(0, k) + new_str + i.substring(k);
//                modified_str_buff = modified_str_buff.replace(i, edited_str);
//            }
//        }
//        System.out.println(modified_str_buff);

        // 1.5
//        String getwords_pattern = "\\W?\\s"; //
//        String[] words = fake_text.split(getwords_pattern);
//
//        String modified_str_buff = new String(fake_text);
//        var match_list = new ArrayList<String>();
//
//        for (var i :  words) {
//            for (var j : words) {
//                if (i.charAt(0) == j.charAt(j.length() - 1) && !match_list.contains(i)) {
//                    match_list.add(i);
//                    System.out.println(i);
//                }
//            }
//        }

        // 1.6
//        String getwords_pattern = "\\W?\\s"; //
//        String[] words = fake_text.split(getwords_pattern);
//
//        int max = 0;
//        int min = 0;
//
//        var min_values = new ArrayList<String>();
//        var max_values = new ArrayList<String>();
//
//        for (var w : words) {
//            int len = w.length();
//
//            if (w == words[0]) { // start value
//                max = len;
//                min = len;
//            }
//
//            if (len > max) {
//                max = len;
//                max_values.add(w);
//            }
//
//            if (len < min) {
//                min = len;
//                min_values.add(w);
//            }
//        }
//
//        int finalMin = min;
//        min_values.removeIf(obj-> obj.length() > finalMin);
//
//        int finalMax = max;
//        max_values.removeIf(obj-> obj.length() < finalMax);
//
//        System.out.println("Min length words:");
//        for (var minvals : min_values) {
//            System.out.println(minvals);
//        }
//
//        System.out.println("Max length words:");
//        for (var maxvals : max_values) {
//            System.out.println(maxvals);
//        }

        // 1.7
//        String getwords_pattern = "\\.\\s";
//        String buffer_new_fake_text = "";
//
//        String[] sentences = fake_text.split(getwords_pattern);
//
//        String inter_word_delim = " ";
//
//        for (var sentence: sentences) {
//
//            // splitting
//            var words = sentence.split(inter_word_delim);
//
//            // swapping
//            var buff = words[0];
//            words[0] = words[words.length - 1];
//            words[words.length - 1] = buff;
//
//            // joining
//            buffer_new_fake_text += String.join(inter_word_delim, words) + ". ";
//        }
//
//        System.out.println(buffer_new_fake_text);


        int[] arr = {
                100, -10, 20, -30, 1000
        };

        ArrayList<Integer> min_values = new ArrayList<>();
        ArrayList<Integer> max_values = new ArrayList<>();

        for (var val : arr) {
            if (val > 0){
                max_values.add(val);
            }
            else if(val < 0){
                min_values.add(val);
            }
        }
    }

}
