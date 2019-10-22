from pathlib import Path

def read_file(file_path:Path):
  with open(file_path) as f:    
      line = f.readline()
      while(line):
        print(line)
        line = f.readline()
