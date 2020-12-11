require("class")

--定义名为 Shape 的基础类
local Shape = class("Shape")


--ctor() 是类的构造函数，在调用 Shape.new() 创建 Shape 对象实例时会自动执行
function Shape:ctor(shapeName)
    self.shapeName = shapeName
    print("Shape:ctor(%s)", self.shapeName)
end
--为 Shape 定义个名为 draw() 的方法
function Shape:draw()
    print("draw %s", self.shapeName)
end



-- Circle 是 Shape 的继承类
local Circle = class("Circle", Shape)
function Circle:ctor()
    -- 如果继承类覆盖了 ctor() 构造函数，那么必须手动调用父类构造函数
    -- 类名.super 可以访问指定类的父类
    Circle.super.ctor(self, "circle")
    self.radius = 100
end

function Circle:setRadius(radius)
    self.radius = radius
end

-- 覆盖父类的同名方法
function Circle:draw()
    print("draw %s, raidus = %0.2f", self.shapeName, self.raidus)
end


--
local Rectangle = class("Rectangle", Shape)

function Rectangle:ctor()
    Rectangle.super.ctor(self, "rectangle")
end

--

local circle = Circle.new()             -- 输出: Shape:ctor(circle)
circle:setRadius(200)
circle:draw()                           -- 输出: draw circle, radius = 200.00
circle.super.draw(circle)                           -- 输出: draw circle, radius = 200.00


local rectangle = Rectangle.new()       -- 输出: Shape:ctor(rectangle)
rectangle:draw()                        -- 输出: draw rectangle



