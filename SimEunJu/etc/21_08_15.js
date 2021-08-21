// ㅇㄹㅂㅇ 2
console.log(
	solution(["1 2 3 4 5 6 7 8", "2 11", "0 11 10", "3 17 19 12 13 9 14 15 10", "20 2 21"], 1, 9)
);
console.log(solution(["1 2 3 4 5 6 7 8 9 10", "2 8"], 1, 10));
console.log(solution(["0 1 2 3 4", "1 12 13 14"], 2, 12));
function solution(subway, start, end) {
	start = start.toString();
	end = end.toString();
	// 그래프를 일단 만들어 보자
	// 문제 : 최소 환승 -> BFS -> 노드 = 환승 구역
	const gh = {};
	const parsed = subway.map((s) => s.split(" "));
	for (let i = 0; i < parsed.length; i++) {
		for (let j = 0; j < parsed.length; j++) {
			if (i === j) continue;
			const common = parsed[i].filter((s) => parsed[j].includes(s));
			if (common.length !== 0) {
				if (!gh[i]) gh[i] = [];
				gh[i].push(j);
			}
		}
	}

	const dfs = (start) => {
		let visited = [];
		let q = [[start, 0]];

		while (q.length !== 0) {
			const [node, nodeCnt] = q.shift();

			if (parsed[node].includes(end)) {
				return nodeCnt;
			}
			if (!visited.includes(node)) {
				visited.push(node);
				const nodesWithCnt = gh[node].map((n) => [n, nodeCnt + 1]);
				q = [...q, ...nodesWithCnt];
			}
		}
	};

	let cnts = [];
	for (let i = 0; i < subway.length; i++) {
		if (parsed[i].includes(start)) {
			cnts.push(dfs(i));
			break;
		}
	}

	return Math.min(...cnts);
}
