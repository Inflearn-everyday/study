#!/usr/bin/env python
from datetime import datetime
import os
from pathlib import Path
import re

author_mapper = {
    'yu-jin-song': 'a',
    'dahyun1023': 'b',
    'wookiist': 'c',
    'hysKim1': 'd',
    'realcrystal': 'e',
    'yeGenieee': 'f',
    'Le0sy': 'g',
    'SimEunJu': 'h',
}

def main():
    global author_mapper
    author = os.environ['AUTHOR']
    if author not in author_mapper:
        print("welcome newcomer! and admin~~ update is needed~!")
        return
        
    today = datetime.today().strftime("%m/%d")
    lines = []
    file_path = Path(os.path.abspath(__file__)).parent.parent/Path('README.md')

    with open(file_path, 'r+') as file:
        lines = file.readlines()

    for idx, line in enumerate(lines):
        if re.search(today, line):
            lines[idx] = line.replace(author_mapper[author], '✅')
            break
    
    with open(file_path, 'w+') as file:
        file.writelines(lines)

if __name__ == "__main__":
    main()
