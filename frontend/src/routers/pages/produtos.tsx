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

export function Produtos() {
  return (
    <Layout>
      <div className="flex flex-col p-10">
        <h1 className="text-white font-bold text-2xl mb-5">Produtos</h1>

        {/* Wrapper para tornar a tabela responsiva */}
        <div className="overflow-x-auto w-full bg-white rounded-md shadow">
          <Table className="min-w-[600px]">
            <TableCaption>Lista de Produtos Cadastrados.</TableCaption>
            <TableHeader>
              <TableRow>
                <TableHead className="w-[100px]">Código</TableHead>
                <TableHead>Nome</TableHead>
                <TableHead className="w-[80px]">Quantidade</TableHead>
                <TableHead className="text-right">Preço</TableHead>
              </TableRow>
            </TableHeader>
            <TableBody>
              <TableRow>
                <TableCell className="font-medium">0001</TableCell>
                <TableCell>Batata</TableCell>
                <TableCell>24</TableCell>
                <TableCell className="text-right">R$3.00</TableCell>
              </TableRow>
              {/* Outros rows podem vir aqui */}
            </TableBody>
          </Table>
        </div>
      </div>
    </Layout>
  )
}
