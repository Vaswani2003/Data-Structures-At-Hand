T = int(input())

class Meeting:
  def __init__(self, s, f, i):
    self.start = s
    self.finish = f
    self.index = i
    
for i in range(T):
  n = int(input())
  starts = list(map(int, input().strip().split(' ')))
  ends = list(map(int, input().strip().split(' ')))
  
  meetings = [Meeting(starts[i],ends[i], i) for i in range(n) ]
  
  meetings.sort(key = lambda meeting: meeting.finish)
  
  stack = [meetings[0]]
  ongoing = [meetings[0].index]
  
  for i in range(1, n):
    meet = meetings[i]
    top = stack[-1]
    
    if meet.start >= top.finish:
      stack.append(meet)
      ongoing.append(meet.index)
      
  for meet in ongoing:
    print(meet+1, end = ' ')
  print()
  
      