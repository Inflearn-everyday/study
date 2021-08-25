function solution(table, languages, preference) {
    const dict = {};
    for(let i=0; i<table.length; i++){
        const langs = table[i].split(" ");
        dict[langs[0]] = 0;
        for(let j=1; j<langs.length; j++){
            const idx = languages.indexOf(langs[j]);
            if(idx !== -1){
                dict[langs[0]] += (5 - j + 1) * preference[idx];
            }
        }
    }
    
    const langs = Object.entries(dict);
    langs.sort((a, b) => {
        if(a[1] > b[1]) return -1;
        if(a[1] < b[1]) return 1;
        return a[0].localeCompare(b[0]);
    });
    
    return langs[0][0]
    
}
