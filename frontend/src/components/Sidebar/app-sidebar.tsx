import { useState } from "react";
import { useLocation, useNavigate } from "react-router-dom";
import { cn } from "@/lib/utils";
import { Button } from "@/components/ui/button";
import Logo from "../../assets/img-marketpay-logo-only.svg";

import {
  CircleDollarSign,
  User,
  Carrot,
  UsersRound,
  Clock,
  Menu,
} from "lucide-react";

export function AppSidebar() {
  const [collapsed, setCollapsed] = useState(false);
  const location = useLocation();
  const navigate = useNavigate();

  const items = [
    {
      icon: CircleDollarSign,
      label: "Venda",
      path: "/venda",
    },
    {
      icon: Carrot,
      label: "Produtos",
      path: "/produtos",
    },
    {
      icon: User,
      label: "Usuários",
      path: "/users",
    },
    {
      icon: UsersRound,
      label: "Clientes",
      path: "/clientes",
    },
    {
      icon: Clock,
      label: "Histórico",
      path: "/historico",
    },
  ];

  return (
    <div
      className={cn(
        "relative h-screen bg-[#424b50] text-white border-r border-[#2e3438] transition-all duration-300",
        collapsed ? "w-16" : "w-64" //64 original
      )}
    >
      {/* Topo com logo e botão de colapsar */}
      <div className="flex items-center justify-between p-4 border-b border-[#2e3438]">
        {!collapsed && (
          <div className="flex items-center space-x-2">
            <img src={Logo} alt="logo-market-pay" className='h-10 rounded-l-md' />
            <div>
              <span className="text-xl font-bold text-[#45cfef]">Market</span>
              <span className="text-xl font-bold text-[#d8fd12]">Pay</span>
            </div>
          </div>
        )}
        <Button
          variant="ghost"
          size="sm"
          onClick={() => setCollapsed(!collapsed)}
          className="text-white hover:bg-[#3a4044] cursor-pointer"
        >
          <Menu className="w-4 h-4" />
        </Button>
      </div>

      {/* Navegação */}
      <nav className="p-4 space-y-2">
        {items.map((item, index) => {
          const isActive = location.pathname === item.path;
          return (
            <Button
              key={index}
              variant={isActive ? "default" : "ghost"}
              className={cn(
                "w-full justify-start text-left cursor-pointer",
                isActive
                  ? "bg-[#45cfef] text-white hover:bg-[#45cfe0]"
                  : "text-white hover:text-white hover:bg-[#3a4044]",
                collapsed && "justify-center px-2"
              )}
              onClick={() => navigate(item.path)}
            >
              <item.icon
                className={cn("w-5 h-5", !collapsed && "mr-3")}
              />
              {!collapsed && item.label}
            </Button>
          );
        })}
      </nav>
    </div>
  );
}
