function solution(s)
{
    let i = 0;
    while(i < s.length-1){
        
        if(s[i] === s[i+1]){
            
            let cnt = 1;
            while(s[i] === s[s+cnt]){
                cnt++;
            }
            if(cnt % 2 === 1) cnt++;
            s = s.substring(0, i) + s.substring(i+cnt);
            
            while(i > 0 && s[i] === s[i-1]){
                i--;
            }
        } 
        else i++;
    }
    if(s.length > 0) return 0;
    return 1;
}
