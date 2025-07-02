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

import CadastraProduto from "../../components/Modal/cadastraProduto";

export function Produtos() {
  return (
    <Layout>
      <div className="flex flex-col p-10 gap-2">
        <div className="flex justify-between items-center">
          <h1 className="text-white font-bold text-2xl mb-5">Produtos</h1>
          <CadastraProduto />
        </div>

        {/* Wrapper para tornar a tabela responsiva */}
        <div className="overflow-x-auto w-full bg-white rounded-md shadow">
          <Table>
            <TableCaption>Lista de Produtos Cadastrados.</TableCaption>
            <TableHeader className="bg-[#363b3d]">
              <TableRow>
                <TableHead className="w-[100px] text-white">Código</TableHead>
                <TableHead className="text-white">Nome</TableHead>
                <TableHead className="w-[40px] text-white">Quantidade</TableHead>
                <TableHead className="w-[100px] text-white">Preço</TableHead>
              </TableRow>
            </TableHeader>
            <TableBody>
              <TableRow className="text-[#000000]">
                <TableCell className="font-medium">0001</TableCell>
                <TableCell>Batata</TableCell>
                <TableCell>24</TableCell>
                <TableCell>R$3.00</TableCell>
              </TableRow>
              {/* Outros rows podem vir aqui */}
            </TableBody>
          </Table>
        </div>
      </div>
    </Layout>
  )
}
