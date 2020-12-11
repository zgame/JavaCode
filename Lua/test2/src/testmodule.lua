
moduleT ={}

function moduleT.new()
    o={
        module = "module"
    }
    setmetatable(o,self)
    self.__index = self
    return o
end

function moduleT.print(self)
    print("moduleT "..self.module)
end

-------------------------

class={}
function class:new()
    o = moduleT:new()
    local father = getmetatable(o)
    setmetatable(o, father)
    --o.super = setmetatable({},father)
    o.super = o
    o.class = "class"
    setmetatable(o,self)
    self.__index = self
    return o
end

function class:print1()
    print("class "..self.module)
end

local m = moduleT.new()
m:print()
local c = class:new()
c:print()
c:print()