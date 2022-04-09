package month_3;

import Utils.TreeNode;

public class LC21 {
    //剑指 Offer II 062. 实现前缀
    //字典树
    static class Trie {
        private Trie[] children;
        private boolean isEnd = false;


        /** Initialize your data structure here. */
        public Trie() {
            this.isEnd=false; // 标记该节点是否是一个单词的结尾
            this.children = new Trie[26]; // 字母映射表
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            Trie trie = this;
            for(int i = 0 ; i < word.length() ; i++){
                int index = word.charAt(i) - 'a';
                if(trie.children[index]==null){
                    trie.children[index] = new Trie();
                }
                trie=trie.children[index];
            }
            trie.isEnd=true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            Trie trie = this;
            for(int i = 0 ; i < word.length() ; i++){
                if(trie.children[word.charAt(i)-'a']==null) return false;
                trie=trie.children[word.charAt(i)-'a'];
            }
            return trie.isEnd;

        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            Trie trie = this;
            for(int i = 0 ; i < prefix.length() ; i++){
                if(trie.children[prefix.charAt(i)-'a']==null) return false;
                trie=trie.children[prefix.charAt(i)-'a'];
            }
            return true;

        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println();
        System.out.println(trie.search("apple"));  // 返回 True
        System.out.println(trie.search("app"));     // 返回 False);
        System.out.println(trie.startsWith("app")); // 返回 True);
        trie.insert("app");
        System.out.println(trie.search("app"));     // 返回 True'
    }


}
