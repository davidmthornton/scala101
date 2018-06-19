def combine(x:Int, y:Int, z:(Int,Int) => Int) = {
  z(x,y)
}

combine(3,2,(a,b)=>a-b)

combine(3,2,(a,b)=>a*b)

combine(3,2,(a,b)=>a max 25)

combine(3,2,(a,b)=>a min b)