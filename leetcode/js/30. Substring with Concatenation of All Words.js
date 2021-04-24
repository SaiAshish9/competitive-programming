var findSubstring = function(s, words) {
    var sLen = s.length;
    var wLen = words.length;
    var wordLen = (words[0] || '').length;
  
    if (!sLen || !wLen || !wordLen) return [];
  
    var count = 0;
    var tmp = '';
    var map1 = {};
    var map2 = {};
    var res = [];
  
    for (var i = 0; i < wLen; i++) {
      map1[words[i]] = (map1[words[i]] || 0) + 1;
    }
  
    out: for (var j = 0; j <= sLen - (wLen * wordLen); j++) {
      map2 = {};
      count = 0;
      while (count < wLen) {
        tmp = s.substr(j + (count * wordLen), wordLen);
        if (map1[tmp] === undefined || map1[tmp] === map2[tmp]) continue out;
        map2[tmp] = (map2[tmp] || 0) + 1;
        count++;
      }
      res.push(j);
    }
  
    return res;
  };
  
  console.log(findSubstring("barfoothefoobarman",["foo","bar"]))