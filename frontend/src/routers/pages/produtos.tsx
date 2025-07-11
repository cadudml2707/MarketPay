import Layout from "../../components/layout/layout"

import {
  Table,
  TableBody,
  TableCaption,
  TableCell,
  TableHead,
  TableHeader,
  TableRow,
} from "@/components/ui/table"

import ModalCadastraProduto from "../../components/Modal/modalCadastraProduto";
import ModalEditaProduto from "@/components/Modal/modalEditaProduto";

export function Produtos() {
  return (
    <Layout>
      <div className="flex flex-col p-10 gap-2">
        <div className="flex justify-between items-center">
          <h1 className="text-white font-bold text-2xl mb-5">Produtos</h1>
          <ModalCadastraProduto />
        </div>
        <div className="overflow-x-auto w-full bg-white rounded-md shadow">
          <Table>
            <TableCaption>Lista de Produtos Cadastrados.</TableCaption>
            <TableHeader className="bg-[#363b3d]">
              <TableRow>
                <TableHead className="w-[10rem] text-white">Código</TableHead>
                <TableHead className="text-white">Nome</TableHead>
                <TableHead className="text-white">Quantidade</TableHead>
                <TableHead className="text-white">Preço</TableHead>
                <TableHead className="text-white">Ações</TableHead>
              </TableRow>
            </TableHeader>
            <TableBody>
              <TableRow className="text-[#000000]">
                <TableCell className="font-medium">0001</TableCell>
                <TableCell>Batata</TableCell>
                <TableCell>24</TableCell>
                <TableCell>R$3.00</TableCell>
                <TableCell>
                  <ModalEditaProduto />
                </TableCell>
              </TableRow>
            </TableBody>
          </Table>
        </div>
      </div>
    </Layout>
  )
}
