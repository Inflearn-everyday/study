// ㄱㄹ 3
function solution(word, cards) {
    if(word.length > cards.length) return 0;
    
    const chars = word.split("");
    
    const cardChars = [];
    for(let i=0; i<cards.length; i++){
        const card = cards[i];
        cardChars.push([]);
        const cardChar = cardChars[i];
        for(let j=0; j<card.length; j++){
            if(chars.includes(card[j])){
                cardChar.push({ idx: j, char: card[j] });
            }
        }
    }
    
    let res = 0;
    const visited = Array(cards.length).fill(false); 
    
    const dfs = (idx=0, remain) => {
        if(remain.length === 0) {
            res += 1;
            return;
        }
        if(idx === cards.length) return;
        
        const cardChar = cardChars[idx];
        for(let i=-1; i<cardChar.length; i++){
            
            if(i === -1){
                dfs(idx + 1, remain);
                continue;
            }
            
            if(visited[cardChar[i].idx] === false && remain.includes(cardChar[i].char)){
                visited[cardChar[i].idx] = true;
                remain = remain.replace(cardChar[i].char, "");
                dfs(idx + 1, remain);
                remain = remain + cardChar[i].char;
                visited[cardChar[i].idx] = false;
            }
            
        }
    };

    dfs(0, word);
    return res;
}
