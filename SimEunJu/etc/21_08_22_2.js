// ㄱㄹ 2
function solution(grades) {
    const scoreRank = ["A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"];
    const gradeCard = {};
    for(let idx=0; idx<grades.length; idx++){
        const [id, score] = grades[idx].split(" ");
        const scoreNth = scoreRank.indexOf(score)
        if(gradeCard[id]){
            if(gradeCard[id].scoreNth > scoreNth){
                gradeCard[id] = { scoreNth, idx };
            }
        }
        else {
            gradeCard[id] = { scoreNth, idx };
        }
    }
    
    const gradeList = Object.entries(gradeCard);
    gradeList.sort((a, b) => {
        if(a[1].scoreNth < b[1].scoreNth) return -1;
        if(a[1].scoreNth === b[1].scoreNth && a[1].idx < b[1].idx) return -1;
        return 1;
    });
    return gradeList.map(grade => `${grade[0]} ${scoreRank[grade[1].scoreNth]}`)
}
