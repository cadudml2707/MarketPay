import { CircleDollarSign, User, Carrot, UsersRound, Clock } from "lucide-react"
import Logo from "../../assets/img-marketpay.svg";

import {
  Sidebar,
  SidebarContent,
  SidebarGroup,
  SidebarGroupContent,
  SidebarGroupLabel,
  SidebarMenu,
  SidebarMenuButton,
  SidebarMenuItem,
} from "@/components/ui/sidebar"

const items = [
  {
    title: "Venda",
    url: "/venda",
    icon: CircleDollarSign,
  },
  {
    title: "Produtos",
    url: "/produtos",
    icon: Carrot,
  },
  {
    title: "Usuários",
    url: "/users",
    icon: User,
  },
  {
    title: "Clientes",
    url: "/clientes",
    icon: UsersRound,
  },
  {
    title: "Histórico de Vendas",
    url: "/historico",
    icon: Clock,
  },
]

export function AppSidebar() {
  return (
    <Sidebar>
      <SidebarContent className="bg-[#424b50]">
        <SidebarGroup>
          <SidebarGroupLabel className="text-[#FFFFFF] flex gap-3 mb-5">
            <img src={Logo} alt="logo-market-pay" className='h-10' />
            <span>MarketPay</span>
          </SidebarGroupLabel>
          <SidebarGroupContent>
            <SidebarMenu>
              {items.map((item) => (
                <SidebarMenuItem className="text-[#FFFFFF]" key={item.title}>
                  <SidebarMenuButton asChild>
                    <a href={item.url}>
                      <item.icon />
                      <span>{item.title}</span>
                    </a>
                  </SidebarMenuButton>
                </SidebarMenuItem>
              ))}
            </SidebarMenu>
          </SidebarGroupContent>
        </SidebarGroup>
      </SidebarContent>
    </Sidebar>
  )
}