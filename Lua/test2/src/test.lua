Object = require("class2")


Point = Object:extend()
function Point:new(x, y)
    self.x = x or 0
    self.y = y or 0
end

function Point.print(self)
    print("point",self.x)
end

Rect = Point:extend()
function Rect:new(x, y, width, height)
    Rect.super.new(self, x, y)
    self.width = width or 0
    self.height = height or 0
end

function Rect:print()
    print("rect",self.width,self.x)
end

line = Point:extend()
function line:new(x, y)
    line.super.new(self, x, y)
end

cube = Rect:extend()
function cube:new(x, y)
    cube.super.new(self, x, y ,99,99)
end


local p = Point(10, 20)     --point	10
local rect = Rect(10, 20, 30,40)    --rect	30 10

local line = line(5, 6)
local cube1 = cube(100, 200, 300,400)

Point.print(p)
Rect.print(rect)
--rect.super:print()
Point.print(line)
Rect.print(cube1)