import { SidebarProvider } from "@/components/ui/sidebar";
import { AppSidebar } from "@/components/mine/app-sidebar";
 
export default function Layout({ children }: { children: React.ReactNode }) {
  return (
    <SidebarProvider className="bg-[#424b50] text-white">
      <AppSidebar />
      <main>
        {children}
      </main>
    </SidebarProvider>
  )
}